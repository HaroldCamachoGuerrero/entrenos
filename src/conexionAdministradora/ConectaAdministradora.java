package conexionAdministradora;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConectaAdministradora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			
		//	Class.forName("oracle.jdbc.OracleDriver");
			Connection miConexion=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "NEO","12345");
			Statement miStatement=miConexion.createStatement();
			ResultSet miResultset=miStatement.executeQuery("Select id,CODIGO,NOMBRE,COD_TP_ID,NRO_ID,NATURALEZA,MULTPIPLE_ARP,FSPFUSIONADA,Fecha_fusion from Administradora");
			
			
			
			while(miResultset.next()) {
				
				System.out.println(miResultset.getString("ID") + ";" + miResultset.getString("CODIGO")  + ";" + miResultset.getString("NOMBRE") + ";" + miResultset.getString("COD_TP_ID") + ";" + miResultset.getString("NRO_ID") + ";" + miResultset.getString("NATURALEZA") + ";" + miResultset.getString("MULTIPLE_ARP") + ";" + miResultset.getString("FSP") + ";" + miResultset.getString("FUSIONADA") +  ";" + miResultset.getString("FECHA_FUSION")    ); 
			}
		}
		
		
		catch (Exception e){
			System.out.println("no conecta");
			e.printStackTrace();
			
			
		}
		
		
	}

}
