package CompositePattern;

import java.util.ArrayList;

public class Folder extends AbstractFile{
	//定义集合filelist，用于AbstractFile存储类型的成员
	private ArrayList<AbstractFile> filelist = new ArrayList <AbstractFile>();
	private String name;

	public Folder(String name) {
		// TODO 自动生成的构造函数存根
		this.name=name;
	}
	@Override
	public void add(AbstractFile file) {
		// TODO 自动生成的方法存根
		filelist.add(file);
	}

	@Override
	public void remove(AbstractFile file) {
		// TODO 自动生成的方法存根
		filelist.remove(file);
	}

	@Override
	public AbstractFile getChild(int i) {
		// TODO 自动生成的方法存根
		return (AbstractFile)filelist.get(i);
	}

	@Override
	public void killVirus() {
		// TODO 自动生成的方法存根
		System.out.println("****对文件夹"+name+"进行杀毒");
		//递归调用成员构件的killVirus（）方法
		for(Object obj : filelist) {
			((AbstractFile)obj).killVirus();
		}
	}

}
