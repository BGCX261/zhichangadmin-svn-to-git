package com.lpx.computer;

public class Mian {
	private String mainborad;
	private String cpu;

	public String getMainborad() {
		return mainborad;
	}

	public void setMainborad(String mainborad) {
		this.mainborad = mainborad;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public void print() {
		System.out.println("���壺" + mainborad + "CPU" + cpu);
	}

	public int[] load(int begin, int end) {
		HardDisk harddisk = new HardDisk();

		return harddisk.read(begin, end);
	}
}
