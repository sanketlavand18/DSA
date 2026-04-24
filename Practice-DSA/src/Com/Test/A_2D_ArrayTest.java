package Com.Test;

import Com.Model.A_2D_Array;

public class A_2D_ArrayTest {
	
	public static void main(String[] args) {
		
		A_2D_Array aa=new A_2D_Array();
		
		aa.acceptData();
		aa.displayData();
		
		A_2D_Array bb=new A_2D_Array();
		bb.acceptData();
		
		A_2D_Array cc=new A_2D_Array(aa.add2DArray(bb));
		cc.displayData();
		
	}	
}
