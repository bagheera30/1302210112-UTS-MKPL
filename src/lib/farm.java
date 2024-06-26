package lib;

import java.util.LinkedList;
import java.util.List;

public class Farm {
    private String spouseName;
	private String spouseIdNumber;

	private List<String> childNames;
	private List<String> childIdNumbers;

    public Farm(String spouseName, String spouseIdNumber, List<String> childNames, List<String> childIdNumbers) {
        this.spouseName = spouseName;
        this.spouseIdNumber = spouseIdNumber;

		childNames = new LinkedList<String>();
		childIdNumbers = new LinkedList<String>();
    }

	public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}
    public String getSpouseIdNumber() {
		return spouseIdNumber;
	}

	public int getChildIdNumbers() {
		return childIdNumbers.size();
	}

}