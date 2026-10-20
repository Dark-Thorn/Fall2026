/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
public class StausUser 
{
    public enum status{
        REJECTED,
        PENDING,
        PROCESSING,
        APPROVED,
        NOT_VALID_CODE
    }
    public void statusDetail(String code)
    {
    switch(code.toUpperCase())
            {
            case "ZERO": System.out.println(status.REJECTED);
            break;
            case "ONE": System.out.println(status.PENDING);
            break;
            case "TWO":
            System.out.println(status.PROCESSING);
            break;
            case "THREE": 
                System.out.println(status.APPROVED);
            break;
            default:
             System.out.println(status.NOT_VALID_CODE);
            break;
            }
    }
 
}
