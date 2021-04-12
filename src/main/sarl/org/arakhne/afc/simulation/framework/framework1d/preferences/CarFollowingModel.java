/* 
 * $Id$
 * This file is a part of the Arakhne Foundation Classes, http://www.arakhne.org/afc
 * 
 * Copyright (c) 2000-2012 Stephane GALLAND.
 * Copyright (c) 2005-10, Multiagent Team, Laboratoire Systemes et Transports,
 * Universite de Technologie de Belfort-Montbeliard.
 * Copyright (c) 2013-2020 The original authors, and other authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.arakhne.afc.simulation.framework.framework1d.preferences;

import org.arakhne.afc.simulation.framework.framework1d.agents.acceleration.IDMPlusAccelerationSelection;
import org.arakhne.afc.simulation.framework.framework1d.agents.acceleration.OriginalIDMAccelerationSelection;
import org.arakhne.afc.simulation.framework.framework1d.agents.acceleration.RtCvcAccelerationSelection;

import com.google.gson.annotations.JsonAdapter;

import io.sarl.lang.core.Skill;

/**
 * Type of car following model.
 *
 * @author $Author: sgalland$
 * @version $FullVersion$
 * @mavengroupid $GroupId$
 * @mavenartifactid $ArtifactId$
 */
@JsonAdapter(CarFollowingModelTypeAdapter.class)
public enum CarFollowingModel {
	/** Reaction Time-based Collaborative Velocity Control.
	 */
	RT_CVC {
		@Override
		public Class<? extends Skill> getSkillType() {
			return RtCvcAccelerationSelection.class;
		}
	},

	/** Intelligent Driver Model - original version.
	 */
	IDM {
		@Override
		public Class<? extends Skill> getSkillType() {
			return OriginalIDMAccelerationSelection.class;
		}
	},

	/** Intelligent Driver Model - IDM+ variant.
	 */
	IDM_PLUS {
		@Override
		public Class<? extends Skill> getSkillType() {
			return IDMPlusAccelerationSelection.class;
		}
	};

	/** Replies the best model according to your experiments.
	 *
	 * @return the best model.
	 */
	public static CarFollowingModel getBestModel() {
		return RT_CVC;
	}

	/** Replies the skill type for the car following model.
	 *
	 * @return the agent skill that implements the car following model.
	 */
	public abstract Class<? extends Skill> getSkillType();

}
