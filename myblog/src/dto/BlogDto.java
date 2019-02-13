package dto;

public class BlogDto{

		private int no;
	    private String userid;
	    private String password;
	    private String colum;


	    public int getNo() {
	    	return no;
	    }
	    public String getUserid() {
	        return userid;
	    }
	    public String getPassword() {
	        return password;
	    }
	    public String getColum() {
	    	return colum;
	    }

	    public void setNo(int no) {
	    	this.no = no;
	    }
	    public void setUserid(String userid) {
	        this.userid = userid;
	    }
	    public void setPassword(String password) {
	        this.password = password;
	    }
	    public void setColum(String colum) {
	    	this.colum = colum;
	    }
}
