package com.techlabs.streams;

public class Region {
	
		private int RegionId;
		private String RegionName;
		public Region(int regionId, String regionName) {
			super();
			RegionId = regionId;
			RegionName = regionName;
		}
		public int getRegionId() {
			return RegionId;
		}
		
		public String getRegionName() {
			return RegionName;
		}
		

}
