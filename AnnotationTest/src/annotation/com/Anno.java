package annotation.com;

public class Anno {
	 
	@FieldMeta(id=true,name="���к�",order=1)
	private int id;
	@FieldMeta(name="����",order=3)
	private String name;
	@FieldMeta(name="����",order=4)
	private int age;
	
	@FieldMeta(description="����",order=2)
	public String desc(){
		return "java�����ȡannotation�Ĳ���";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}