import gudusoft.gsqlparser.EDbVendor;
import gudusoft.gsqlparser.TGSqlParser;


public class CreateTable {
	String input;
	TGSqlParser sqlparser;
	public CreateTable(String input){
		this.input = input;
		sqlparser = new TGSqlParser(EDbVendor.dbvoracle);
	}
	public void create(){
		sqlparser.sqltext = input;
		
		int ret = sqlparser.parse();
		if(ret == 0){
			for(int i = 0; i < sqlparser.sqlstatements.size(); i++){
				analyzeScript.analyzeStmt(sqlparser.sqlstatements.get(i));
				System.out.println("");
			}
		} else {
			System.out.println(sqlparser.getErrormessage());
		}
			
	}
	
}
