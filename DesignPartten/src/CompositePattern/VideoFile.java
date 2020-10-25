package CompositePattern;

public class VideoFile extends AbstractFile{
	private String name;

	public VideoFile(String name) {
		// TODO 自动生成的构造函数存根
		this.name=name;
	}
	@Override
	public void add(AbstractFile file) {
		// TODO 自动生成的方法存根
		System.out.println("对不起，不支持该方法");
	}

	@Override
	public void remove(AbstractFile file) {
		// TODO 自动生成的方法存根
		System.out.println("对不起，不支持该方法");
	}

	@Override
	public AbstractFile getChild(int i) {
		// TODO 自动生成的方法存根
		System.out.println("对不起，不支持该方法");
		return null;
	}

	@Override
	public void killVirus() {
		// TODO 自动生成的方法存根
		// 模拟杀毒
		System.out.println("----对图像文件"+name+"进行杀毒");
	}

}

