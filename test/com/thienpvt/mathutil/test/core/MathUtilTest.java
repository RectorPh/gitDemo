package com.thienpvt.mathutil.test.core;

import com.thienpvt.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;




//tester is write code to test main code
//Unit test dev phải có trách nhiệm đảm bảo code ra ngon

//Đảm bảo bằng 
//test automation, viết code test để test code chính
//Xài dùng một framework/bộ thư viện, viết code ngắn để gọi hàm cần test
//Viết code này cho các case xài hàm

//Mắt chỉ nhìn 2 màu xanh đỏ

public class MathUtilTest {
    
    //Class use framework JUnit để test code chính
    //Viết code để test code chính bên kia
    
    
    //có nhiều quy tắc đặt tên hàm kiểm thử
    //Quy tắc đặt tên nói lên mucjd dích cảu các test case
    
    //Hàm dưới đây là tình huống test hàm chạy thành công, trả về ngon
    //ta xài theo kiểu well - đưa 5!, 6!
    
    //@Test Junit sẽ phối hợp JVM để chạy hàm này
    //@Test phía hậu trường public static void main 
    //đảm bảo nhiều main để chạy
    @Test
    public void testGetFactorialGivenRightArgumentReturnWell(){
        int n = 0;
        //test thử tình huống tử tế đầu vào
        
        long expected = 1;
        long actual = MathUtil.getFactorial(n);
        
        //so sanh nao
        Assert.assertEquals(expected, actual);
        //Assert 2 values equal or not
        //if yes > Green, no > red
        //Nếu kh gúm nhau
        
        
        //aggreate more case into
        
//        Assert.assertEquals(1,MathUtil.getFactory(1));
//        Assert.assertEquals(2, MathUtil.getFactory(2));
//        Assert.assertEquals(6, MathUtil.getFactory(3));
//        Assert.assertEquals(24, MathUtil.getFactory(4));
//        Assert.assertEquals(120, MathUtil.getFactory(5));
//        Assert.assertEquals(720, MathUtil.getFactory(6));
//        
        //các bước để test
        //Liệt kê ra các case cần test
        
        
    }
    
    
    //Hàm getF() có hai tình huống xử lí
    //1. Đưa data tử tế trong [0..20] -> Tính đúng dc n! -> Done
    //2. Đưa data cà chớn, âm, > 20; thiết kế của hàm là phải ném ra ngoại lệ
    //Kì vọng ngoại lệ xuất hiện khi N < 0 || N > 20
    // -> Catch exception
    
   //Test case:
   //input: -5 
   //expected: IllegalArgumentException
   //tình huống bất thường, ngoại lệ, ngoài dự tính là những thứ kh thể đo lường
   //so sánh theo kiểu value
   //mà chỉ có thể đo lường bằng cách chúng có xuất hiện hay không
    //Kh thể dùng hàm assertEquals() kh thể dùng để so sánh hai ngoại lệ
    //Equals là bằng nhau hay không trên value!!!
    
    
    //Red color đó em do hàm đúng là ném ngoại lệ thật sự
    //Nhưng kh phải ngoại lệ như kì vọng
    //Kh phải hàm ném sai–
    
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException(){
    
        try {
            
            MathUtil.getFactorial(-5);
            
        } catch (Exception e) {
            
            
            Assert.assertEquals("Invalid argument must be between 0 and 20",
                    e.getMessage());
            //Can't access why?
            
            
            
        }
                       
    }
    
    //Another way to catch exception, viết tự nhiên hơn
    
    //Stream API 
    
    
    
}
