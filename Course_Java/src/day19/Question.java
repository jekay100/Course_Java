package day19;

import java.util.ArrayList;
import java.util.List;

public class Question {
	//这是个类，对象 在哪了在文件里了
	private int id;
	private String text;
	private  List<String> options = new ArrayList<String>();
	private char answer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public List<String> getOptions() {
		return options;
	}
	public void setOptions(List<String> options) {
		this.options = options;
	}
	public char getAnswer() {
		return answer;
	}
	public void setAnswer(char answer) {
		this.answer = answer;
	}
	
	@Override
	public boolean equals(Object arg0) {
		if(arg0 == null){
			return false;
		}
		if(this == arg0){
			return true;
		}
		if(arg0 instanceof Question){
			Question arg1 = (Question)arg0;
			return arg1.id == id;
		}
		return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id;
	}
	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		buf.append(id).append(text).append("\n");
		for(String o:options){
			//集合迭代，简化
			buf.append(o).append(' ').append("\n");
		}
		return buf.toString();
	}
}
