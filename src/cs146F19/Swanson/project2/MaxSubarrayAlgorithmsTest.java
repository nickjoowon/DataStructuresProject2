package cs146F19.Swanson.project2;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;

public class MaxSubarrayAlgorithmsTest {

	@Test
	public void test() throws FileNotFoundException {
		
		MaxSubarrayAlgorithms b = new MaxSubarrayAlgorithms();
		Scanner scan = new Scanner(new File("maxSumtest.txt"));

		//the test cases
		int [] test1 = b.txtToArray(scan);
		scan.nextLine();
		int [] test2 = b.txtToArray(scan);
		scan.nextLine();
		int [] test3 = b.txtToArray(scan);
		scan.nextLine();
		int [] test4 = b.txtToArray(scan);
		scan.nextLine();
		int [] test5 = b.txtToArray(scan);
		scan.nextLine();
		int [] test6 = b.txtToArray(scan);
		scan.nextLine();
		int [] test7 = b.txtToArray(scan);
		scan.nextLine();
		int [] test8 = b.txtToArray(scan);
		scan.nextLine();
		int [] test9 = b.txtToArray(scan);
		scan.nextLine();
		int [] test10 = b.txtToArray(scan);
		scan.close();
		
		//case 1
		assertEquals(b.kadanesAlg(test1).getProfit(),239);
		assertEquals(b.kadanesAlg(test1).getArrive(),77);
		assertEquals(b.kadanesAlg(test1).getDepart(),97);
		
		assertEquals(b.bruteForceAlg(test1).getProfit(),239);
		assertEquals(b.bruteForceAlg(test1).getArrive(),77);
		assertEquals(b.bruteForceAlg(test1).getDepart(),97);
		
		assertEquals(b.divideConquerAlg(test1,0,99).getProfit(),239);
		assertEquals(b.divideConquerAlg(test1,0,99).getArrive(),77);
		assertEquals(b.divideConquerAlg(test1,0,99).getDepart(),97);
		
		//case 2
		assertEquals(b.kadanesAlg(test2).getProfit(),322);
		assertEquals(b.kadanesAlg(test2).getArrive(),50);
		assertEquals(b.kadanesAlg(test2).getDepart(),99);
		
		assertEquals(b.bruteForceAlg(test2).getProfit(),322);
		assertEquals(b.bruteForceAlg(test2).getArrive(),50);
		assertEquals(b.bruteForceAlg(test2).getDepart(),99);
				
		assertEquals(b.divideConquerAlg(test2,0,99).getProfit(),322);
		assertEquals(b.divideConquerAlg(test2,0,99).getArrive(),50);
		assertEquals(b.divideConquerAlg(test2,0,99).getDepart(),99);
		
		//case 3
		assertEquals(b.kadanesAlg(test3).getProfit(),305);
		assertEquals(b.kadanesAlg(test3).getArrive(),17);
		assertEquals(b.kadanesAlg(test3).getDepart(),39);
					
		assertEquals(b.bruteForceAlg(test3).getProfit(),305);
		assertEquals(b.bruteForceAlg(test3).getArrive(),17);
		assertEquals(b.bruteForceAlg(test3).getDepart(),39);
						
		assertEquals(b.divideConquerAlg(test3,0,99).getProfit(),305);
		assertEquals(b.divideConquerAlg(test3,0,99).getArrive(),17);
		assertEquals(b.divideConquerAlg(test3,0,99).getDepart(),39);
		
		//case 4
		assertEquals(b.kadanesAlg(test4).getProfit(),271);
		assertEquals(b.kadanesAlg(test4).getArrive(),60);
		assertEquals(b.kadanesAlg(test4).getDepart(),98);
					
		assertEquals(b.bruteForceAlg(test4).getProfit(),271);
		assertEquals(b.bruteForceAlg(test4).getArrive(),60);
		assertEquals(b.bruteForceAlg(test4).getDepart(),98);
						
		assertEquals(b.divideConquerAlg(test4,0,99).getProfit(),271);
		assertEquals(b.divideConquerAlg(test4,0,99).getArrive(),60);
		assertEquals(b.divideConquerAlg(test4,0,99).getDepart(),98);
				
		//case 5
		assertEquals(b.kadanesAlg(test5).getProfit(),281);
		assertEquals(b.kadanesAlg(test5).getArrive(),54);
		assertEquals(b.kadanesAlg(test5).getDepart(),77);
					
		assertEquals(b.bruteForceAlg(test5).getProfit(),281);
		assertEquals(b.bruteForceAlg(test5).getArrive(),54);
		assertEquals(b.bruteForceAlg(test5).getDepart(),77);
						
		assertEquals(b.divideConquerAlg(test5,0,99).getProfit(),281);
		assertEquals(b.divideConquerAlg(test5,0,99).getArrive(),54);
		assertEquals(b.divideConquerAlg(test5,0,99).getDepart(),77);
				
		//case 6
		assertEquals(b.kadanesAlg(test6).getProfit(),215);
		assertEquals(b.kadanesAlg(test6).getArrive(),64);
		assertEquals(b.kadanesAlg(test6).getDepart(),99);
					
		assertEquals(b.bruteForceAlg(test6).getProfit(),215);
		assertEquals(b.bruteForceAlg(test6).getArrive(),64);
		assertEquals(b.bruteForceAlg(test6).getDepart(),99);
						
		assertEquals(b.divideConquerAlg(test6,0,99).getProfit(),215);
		assertEquals(b.divideConquerAlg(test6,0,99).getArrive(),64);
		assertEquals(b.divideConquerAlg(test6,0,99).getDepart(),99);
				
		//case 7
		assertEquals(b.kadanesAlg(test7).getProfit(),207);
		assertEquals(b.kadanesAlg(test7).getArrive(),38);
		assertEquals(b.kadanesAlg(test7).getDepart(),86);
					
		assertEquals(b.bruteForceAlg(test7).getProfit(),207);
		assertEquals(b.bruteForceAlg(test7).getArrive(),38);
		assertEquals(b.bruteForceAlg(test7).getDepart(),86);
						
		assertEquals(b.divideConquerAlg(test7,0,99).getProfit(),207);
		assertEquals(b.divideConquerAlg(test7,0,99).getArrive(),38);
		assertEquals(b.divideConquerAlg(test7,0,99).getDepart(),86);
				
		//case 8
		assertEquals(b.kadanesAlg(test8).getProfit(),309);
		assertEquals(b.kadanesAlg(test8).getArrive(),3);
		assertEquals(b.kadanesAlg(test8).getDepart(),48);
					
		assertEquals(b.bruteForceAlg(test8).getProfit(),309);
		assertEquals(b.bruteForceAlg(test8).getArrive(),3);
		assertEquals(b.bruteForceAlg(test8).getDepart(),48);
						
		assertEquals(b.divideConquerAlg(test8,0,99).getProfit(),309);
		assertEquals(b.divideConquerAlg(test8,0,99).getArrive(),3);
		assertEquals(b.divideConquerAlg(test8,0,99).getDepart(),48);
				
		//case 9
		assertEquals(b.kadanesAlg(test9).getProfit(),195);
		assertEquals(b.kadanesAlg(test9).getArrive(),34);
		assertEquals(b.kadanesAlg(test9).getDepart(),58);
					
		assertEquals(b.bruteForceAlg(test9).getProfit(),195);
		assertEquals(b.bruteForceAlg(test9).getArrive(),34);
		assertEquals(b.bruteForceAlg(test9).getDepart(),58);
						
		assertEquals(b.divideConquerAlg(test9,0,99).getProfit(),195);
		assertEquals(b.divideConquerAlg(test9,0,99).getArrive(),34);
		assertEquals(b.divideConquerAlg(test9,0,99).getDepart(),58);
				
		//case 10
		assertEquals(b.kadanesAlg(test10).getProfit(),390);
		assertEquals(b.kadanesAlg(test10).getArrive(),4);
		assertEquals(b.kadanesAlg(test10).getDepart(),45);
					
		assertEquals(b.bruteForceAlg(test10).getProfit(),390);
		assertEquals(b.bruteForceAlg(test10).getArrive(),4);
		assertEquals(b.bruteForceAlg(test10).getDepart(),45);
						
		assertEquals(b.divideConquerAlg(test10,0,99).getProfit(),390);
		assertEquals(b.divideConquerAlg(test10,0,99).getArrive(),4);
		assertEquals(b.divideConquerAlg(test10,0,99).getDepart(),45);
	}

}
