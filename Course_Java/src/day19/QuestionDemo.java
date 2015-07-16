package day19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QuestionDemo {
	public static void main(String[] args) throws IOException{
		//读取文件为qustion的集合，
		List<Question> questions = read("question.txt");
		//迭代每个问题，因为要与用户交互了，输出某个题攻取用户选择与标准答案比较如果一致就对了
//		Iterator<Question> i = questions.iterator();
//		while(i.hasNext()){
//			Question q = i.next();
//			System.out.println(q);
//		}
		for(Question o :questions){
			System.out.println(o);
			//这里获取用户答案不用Scanner
			//BufferedReader里面的参数必须是Reader
			//in标准的InputStream
			BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
			String str = console.readLine();
			if(str.charAt(0) == o.getAnswer()){
				System.out.println("恭喜你进行下一题");
			}
			
		}
		
	}

	private static List<Question> read(String filename) throws IOException{
		//返回值是集合所以定义出来
		List<Question> list = new ArrayList<Question>();
		//方法里面不能用private等吗
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String str;
		while((str = in.readLine()) != null){
			//第一行是题干
			Question q  = new Question();
			//下面的这个小写
			//System.out.println(q);
			System.out.println(str.indexOf(' '));
			String id = str.substring(0, str.indexOf(' '));
			System.out.println(id);
			q.setId(Integer.parseInt(id));
			q.setText(str.substring(str.indexOf(' ')));
			//上面解析完题干了
			//处理选项		
			q.getOptions().add(in.readLine());
			
			q.getOptions().add(in.readLine());
			q.getOptions().add(in.readLine());
			q.getOptions().add(in.readLine());
			q.setAnswer(in.readLine().charAt(0));
			//System.out.println(q.getOptions());
			list.add(q);
		}
		return list;
	}
}
