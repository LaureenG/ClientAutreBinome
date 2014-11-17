import connexion.Connexion;


public class Services {
	private static int id = 0;
	public static String deleteNom(String string) { // "supprimer_nom"
		// TODO : todo
		return "";
	}

	public static String deleteSurnom(String string) { // "supprimer_surnom
		// TODO : todo
		return "";
	}

	public static String getSurnom(String string) { // "lister" & p=NOM
		// TODO : todo
		return "";
	}

	public static String getSurnom() { // "lister" & p="surnom"
		// TODO : todo
		return "";
	}

	public static String getName() { // "lister" & p="nom"
		// TODO : todo
		return "";
	}

	public static String getAll() { // "lister" & p="tout"
		String [] args = new String[4];
		args[0] = "\"requete\" : \"lister\"";
		args[1] = "\"parametre\" : \"tout\"";
		args[2] = "\"id\" : "+ ++id +"";
		args[3] = null;
		String query = createQuery(args);
		Connexion.getInstance().sendString(query);
		return Connexion.getInstance().receiveString();
	}

	private static String createQuery(String[] args) {
		String toRet = "{";
		for(int i = 0 ; i < args.length ; i++) {
			if(args[i]!=null) {
				toRet += args[i];
			}
			if(i != args.length-1 && args[i+1] != null) {
				toRet += ",";
			}
		}
		toRet += "}\n";
		return toRet;
	}

	public static String postSurname(String string, String string2) { // "ajouter_nom" & NAME & NAME2
		// TODO : todo
		return "";
	}

	public static String postName(String string, String string2) { // "modifier_nom" & NAME & NAME 2
		// TODO : todo
		return "";
	}

	public static String putSurname(String string, String string2) { // "modifier_surnom" & NAME & NAME2
		// TODO : todo
		return "";
	}

	/*private static String fromReplyToString(Query query, Reply reply) {
		// TODO : todo
		return "";
	}*/

	public static String close() { // "exit"
		// TODO : todo
		return "";
	}
}
