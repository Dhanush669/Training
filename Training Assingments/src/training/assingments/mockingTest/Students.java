/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.assingments.mockingTest;

public class Students {
    StudentsDb help;
    public Students(StudentsDb help){
        this.help=help;
    }
    public float getAvg(String std_name){
        return help.getTotal(std_name)/6;
    }
}
