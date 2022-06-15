
package com.thienpvt.mathutil.test.core;

import com.thienpvt.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


//acau lenh nay cua Junit bao hieu rang se can looop qua dataset
//De lay cap data input/expected nhoi vao lam
@RunWith(value = Parameterized.class)
public class MathUtilsDDTTest {
    
    //return array 2-demention
    @Parameterized.Parameters //JUnit se ngam chay loop qua tung dong cua mang
                              //de lay ra cap data input/expected
                              //ten ham hong quan trong, quan trong la @annotation
    public static Object[][] initData(){
        
        return new Integer[][]{
                        {0, 1},
                        {1, 1},
                        {2, 2},
                        {3, 6},
                        {4, 24},
                        {6, 720},
        };
    }
    
    //Loop qua hàm để gán từng value để nhồi input cho các hàm
    @Parameterized.Parameter(value = 0)
    public int n; //biến map value của cột 0 của mảng
    
    @Parameterized.Parameter(value = 1)
    public long expected; //kiểu long vì giá trị trả về của hàm getF() là long
    
    
    @Test
    public void testGetFactorialGivenRightArgument(){
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
    
    
}
