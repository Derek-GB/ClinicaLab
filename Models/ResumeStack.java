/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.List;
import java.util.Stack;


/**
 *
 * @author d2tod
 */
public class ResumeStack implements IResume<Resume> {
    private Stack<Resume> resumeStack; 

    public ResumeStack(){
        resumeStack = new Stack<>();
    }
    
    @Override
    public boolean add(Resume element) {
        return resumeStack.add(element);
    }

    @Override
    public Resume get(Resume element) {
        return resumeStack.peek();
    }

    @Override
    public List getAll() {
        return resumeStack;
    }
    
    
}
