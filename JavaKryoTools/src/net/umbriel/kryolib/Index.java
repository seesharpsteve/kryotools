package net.umbriel.kryolib;

/**
 *     Copyright (C) 2013  Daniel Jameson

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>. 
 */

/**
 * @author daniel
 * Class to represent kryoflux index OOB blocks
 * Uses longs to ensure that everything remains +ve...
 *
 */


public class Index {
	private long sPos;
	private long timer;
	private long sysTime;
	private int fIndex;
	
	public Index() {
		setSPos(0);
		setTimer(0);
		setSysTime(0);
	}

	/**
	 * @return stream position
	 */
	public long getSPos() {
		return sPos;
	}

	/**
	 * @param set stream position
	 */
	public void setSPos(long sPos) {
		this.sPos = sPos;
	}

	/**
	 * @return Timer value
	 */
	public long getTimer() {
		return timer;
	}

	/**
	 * @param set Timer value
	 */
	public void setTimer(long timer) {
		this.timer = timer;
	}

	/**
	 * @return the system time when index detected
	 */
	public long getSysTime() {
		return sysTime;
	}

	/**
	 * @param set system time when index detected
	 */
	public void setSysTime(long sysTime) {
		this.sysTime = sysTime;
	}

	/**
	 * @return the array index of the first flux after this index
	 */
	public int getFluxIndex() {
		return fIndex;
	}

	/**
	 * @param set the index of the first flux after this index
	 */
	public void setFluxIndex(int fIndex) {
		this.fIndex = fIndex;
	}
	
}
