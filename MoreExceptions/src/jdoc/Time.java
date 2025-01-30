/**
 * 
 */
package jdoc;

	/**
	 * This class is Timeless....
	 * 
	 * @author Aidan McGowan
	 *
	 */
	public class Time {

		private int hour;
		private int minute;
		private int second;

		private String timeAsString = hour + ":" + minute + ":" + second;

		/**
		 * creates a time object 
		 */
		public Time() {

		}

		/**
		 * creates a time object 
		 * @param hour min 0 max 23
		 * @param minute
		 * @param second
		 */
		public Time(int hour, int minute, int second) {

			this.hour = hour;
			this.minute = minute;
			this.second = second;
		}

		/**
		 * @return the hour
		 */
		public int getHour() {
			return hour;
		}

		/**
		 * @param hour the hour to set
		 */
		public void setHour(int hour) {
			this.hour = hour;
		}

		/**
		 * @return the minute
		 */
		public int getMinute() {
			return minute;
		}

		/**
		 * @param minute the minute to set
		 */
		public void setMinute(int minute) {
			this.minute = minute;
		}

		/**
		 * @return the second
		 */
		public int getSecond() {
			return second;
		}

		/**
		 * @param second the second to set
		 */
		public void setSecond(int second) {
			this.second = second;
		}

		@Override
		public String toString() {
			return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
		}

		public String getTimeAsString() {
			return timeAsString;
		}

	}
