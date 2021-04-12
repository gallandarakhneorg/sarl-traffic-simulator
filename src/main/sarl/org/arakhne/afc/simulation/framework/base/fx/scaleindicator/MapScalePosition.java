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
package org.arakhne.afc.simulation.framework.base.fx.scaleindicator;

/**
 * A drawer of the map scale indicators.
 * 
 * @author $Author: sgalland$
 * @version $FullVersion$
 * @mavengroupid $GroupId$
 * @mavenartifactid $ArtifactId$
 */
public enum MapScalePosition {

	/**
	 * No position, ie the map scale should not be drawn.
	 */
	NONE {

		@Override
		public boolean isTextOnLeft() {
			return false;
		}

		@Override
		public boolean isTextAtCenter() {
			return false;
		}

		@Override
		public boolean isTextOnRight() {
			return false;
		}

		@Override
		public boolean isLeftColumn() {
			return false;
		}

		@Override
		public boolean isMiddleColumn() {
			return false;
		}

		@Override
		public boolean isRightColumn() {
			return false;
		}

		@Override
		public boolean isTopRow() {
			return false;
		}

		@Override
		public boolean isMiddleRow() {
			return false;
		}

		@Override
		public boolean isBottomRow() {
			return false;
		}
	},

	/**
	 * Top left corner.
	 */
	TOP_LEFT {

		@Override
		public boolean isTextOnLeft() {
			return true;
		}

		@Override
		public boolean isTextAtCenter() {
			return false;
		}

		@Override
		public boolean isTextOnRight() {
			return false;
		}

		@Override
		public boolean isLeftColumn() {
			return true;
		}

		@Override
		public boolean isMiddleColumn() {
			return false;
		}

		@Override
		public boolean isRightColumn() {
			return false;
		}

		@Override
		public boolean isTopRow() {
			return true;
		}

		@Override
		public boolean isMiddleRow() {
			return false;
		}

		@Override
		public boolean isBottomRow() {
			return false;
		}
	},

	/**
	 * Top center border.
	 */
	TOP {

		@Override
		public boolean isTextOnLeft() {
			return false;
		}

		@Override
		public boolean isTextAtCenter() {
			return true;
		}

		@Override
		public boolean isTextOnRight() {
			return false;
		}

		@Override
		public boolean isLeftColumn() {
			return false;
		}

		@Override
		public boolean isMiddleColumn() {
			return true;
		}

		@Override
		public boolean isRightColumn() {
			return false;
		}

		@Override
		public boolean isTopRow() {
			return true;
		}

		@Override
		public boolean isMiddleRow() {
			return false;
		}

		@Override
		public boolean isBottomRow() {
			return false;
		}
	},

	/**
	 * Top right corner.
	 */
	TOP_RIGHT {

		@Override
		public boolean isTextOnLeft() {
			return false;
		}

		@Override
		public boolean isTextAtCenter() {
			return false;
		}

		@Override
		public boolean isTextOnRight() {
			return true;
		}

		@Override
		public boolean isLeftColumn() {
			return false;
		}

		@Override
		public boolean isMiddleColumn() {
			return false;
		}

		@Override
		public boolean isRightColumn() {
			return true;
		}

		@Override
		public boolean isTopRow() {
			return true;
		}

		@Override
		public boolean isMiddleRow() {
			return false;
		}

		@Override
		public boolean isBottomRow() {
			return false;
		}
	},

	/**
	 * Center left border.
	 */
	LEFT {

		@Override
		public boolean isTextOnLeft() {
			return true;
		}

		@Override
		public boolean isTextAtCenter() {
			return false;
		}

		@Override
		public boolean isTextOnRight() {
			return false;
		}

		@Override
		public boolean isLeftColumn() {
			return true;
		}

		@Override
		public boolean isMiddleColumn() {
			return false;
		}

		@Override
		public boolean isRightColumn() {
			return false;
		}

		@Override
		public boolean isTopRow() {
			return false;
		}

		@Override
		public boolean isMiddleRow() {
			return true;
		}

		@Override
		public boolean isBottomRow() {
			return false;
		}
	},

	/**
	 * Center right border.
	 */
	RIGHT {

		@Override
		public boolean isTextOnLeft() {
			return false;
		}

		@Override
		public boolean isTextAtCenter() {
			return false;
		}

		@Override
		public boolean isTextOnRight() {
			return true;
		}

		@Override
		public boolean isLeftColumn() {
			return false;
		}

		@Override
		public boolean isMiddleColumn() {
			return false;
		}

		@Override
		public boolean isRightColumn() {
			return true;
		}

		@Override
		public boolean isTopRow() {
			return false;
		}

		@Override
		public boolean isMiddleRow() {
			return true;
		}

		@Override
		public boolean isBottomRow() {
			return false;
		}
	},

	/**
	 * Bottom left corner.
	 */
	BOTTOM_LEFT {

		@Override
		public boolean isTextOnLeft() {
			return true;
		}

		@Override
		public boolean isTextAtCenter() {
			return false;
		}

		@Override
		public boolean isTextOnRight() {
			return false;
		}

		@Override
		public boolean isLeftColumn() {
			return true;
		}

		@Override
		public boolean isMiddleColumn() {
			return false;
		}

		@Override
		public boolean isRightColumn() {
			return false;
		}

		@Override
		public boolean isTopRow() {
			return false;
		}

		@Override
		public boolean isMiddleRow() {
			return false;
		}

		@Override
		public boolean isBottomRow() {
			return true;
		}
	},

	/**
	 * Bottom center border.
	 */
	BOTTOM {

		@Override
		public boolean isTextOnLeft() {
			return false;
		}

		@Override
		public boolean isTextAtCenter() {
			return true;
		}

		@Override
		public boolean isTextOnRight() {
			return false;
		}

		@Override
		public boolean isLeftColumn() {
			return false;
		}

		@Override
		public boolean isMiddleColumn() {
			return true;
		}

		@Override
		public boolean isRightColumn() {
			return false;
		}

		@Override
		public boolean isTopRow() {
			return false;
		}

		@Override
		public boolean isMiddleRow() {
			return false;
		}

		@Override
		public boolean isBottomRow() {
			return true;
		}
	},

	/**
	 * Bottom right corner.
	 */
	BOTTOM_RIGHT {

		@Override
		public boolean isTextOnLeft() {
			return false;
		}

		@Override
		public boolean isTextAtCenter() {
			return false;
		}

		@Override
		public boolean isTextOnRight() {
			return true;
		}

		@Override
		public boolean isLeftColumn() {
			return false;
		}

		@Override
		public boolean isMiddleColumn() {
			return false;
		}

		@Override
		public boolean isRightColumn() {
			return true;
		}

		@Override
		public boolean isTopRow() {
			return false;
		}

		@Override
		public boolean isMiddleRow() {
			return false;
		}

		@Override
		public boolean isBottomRow() {
			return true;
		}
	};

	/**
	 * Replies if right alignment for the text is preferred for the position.
	 * 
	 * @return <code>true</code> if right alignment is preferred; otherwise
	 *         <code>false</code>.
	 */
	public abstract boolean isTextOnRight();

	/**
	 * Replies if center alignment for the text is preferred for the position.
	 * 
	 * @return <code>true</code> if center alignment is preferred; otherwise
	 *         <code>false</code>.
	 */
	public abstract boolean isTextAtCenter();

	/**
	 * Replies if left alignment for the text is preferred for the position.
	 * 
	 * @return <code>true</code> if left alignment is preferred; otherwise
	 *         <code>false</code>.
	 */
	public abstract boolean isTextOnLeft();

	/**
	 * Replies if this map scale position is on the left side of the screen.
	 * 
	 * @return <code>true</code> if this is {@link #TOP_LEFT}, {@link #LEFT}, or
	 *         {@link #BOTTOM_LEFT}; otherwise <code>false</code>.
	 */
	public abstract boolean isLeftColumn();

	/**
	 * Replies if this map scale position is on the right side of the screen.
	 * 
	 * @return <code>true</code> if this is {@link #TOP_RIGHT}, {@link #RIGHT}, or
	 *         {@link #BOTTOM_RIGHT}; otherwise <code>false</code>.
	 */
	public abstract boolean isRightColumn();

	/**
	 * Replies if this map scale position is on the middle column of the screen.
	 * 
	 * @return <code>true</code> if this is {@link #TOP}, or {@link #BOTTOM};
	 *         otherwise <code>false</code>.
	 */
	public abstract boolean isMiddleColumn();

	/**
	 * Replies if this map scale position is on the upper side of the screen.
	 * 
	 * @return <code>true</code> if this is {@link #TOP_LEFT}, {@link #TOP}, or
	 *         {@link #TOP_RIGHT}; otherwise <code>false</code>.
	 */
	public abstract boolean isTopRow();

	/**
	 * Replies if this map scale position is on the lower side of the screen.
	 * 
	 * @return <code>true</code> if this is {@link #BOTTOM_LEFT}, {@link #BOTTOM},
	 *         or {@link #BOTTOM_RIGHT}; otherwise <code>false</code>.
	 */
	public abstract boolean isBottomRow();

	/**
	 * Replies if this map scale position is on the middle row of the screen.
	 * 
	 * @return <code>true</code> if this is {@link #LEFT}, or {@link #RIGHT};
	 *         otherwise <code>false</code>.
	 */
	public abstract boolean isMiddleRow();

}