package com.example.pinedlistview;

public interface IItem {
	
	public static final int TYPE_GROUP = 0;
	public static final int TYPE_MEMBER = 1;
	
	int getItemViewType();
	
	void setGroupPosition(int groupPosition);
	
	int getGroupPosition();
	
}
