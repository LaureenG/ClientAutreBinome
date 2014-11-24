import connexion.Connexion;

public class Services {
	private static int id = 0;

	public static String deleteNom(String string) { // "supprimer_nom"
		String args[] = new String[3];
		args[0] = "\"requete\" : \"supprimer_nom\"";
		args[1] = "\"parametre\" : \"" + string + "\"";
		args[2] = "\"id\" : " + ++id + "";
		String query = createQuery(args);
		Connexion.getInstance().sendString(query);
		return Connexion.getInstance().receiveString();
	}

	public static String deleteSurnom(String string) { // "supprimer_surnom
		String args[] = new String[3];
		args[0] = "\"requete\" : \"supprimer_surnom\"";
		args[1] = "\"parametre\" : \"" + string + "\"";
		args[2] = "\"id\" : " + ++id + "";
		String query = createQuery(args);
		Connexion.getInstance().sendString(query);
		return Connexion.getInstance().receiveString();
	}

	public static String getSurnom(String string) { // "lister" & p=NOM
		String args[] = new String[3];
		args[0] = "\"requete\" : \"lister\"";
		args[1] = "\"parametre\" : \"" + string + "\"";
		args[2] = "\"id\" : " + ++id + "";
		String query = createQuery(args);
		Connexion.getInstance().sendString(query);
		return Connexion.getInstance().receiveString();
	}

	public static String getSurnom() { // "lister" & p="surnom"
		String args[] = new String[3];
		args[0] = "\"requete\" : \"lister\"";
		args[1] = "\"parametre\" : \"surnom\"";
		args[2] = "\"id\" : " + ++id + "";
		String query = createQuery(args);
		Connexion.getInstance().sendString(query);
		return Connexion.getInstance().receiveString();
	}

	public static String getName() { // "lister" & p="nom"
		String args[] = new String[3];
		args[0] = "\"requete\" : \"lister\"";
		args[1] = "\"parametre\" : \"nom\"";
		args[2] = "\"id\" : " + ++id + "";
		String query = createQuery(args);
		Connexion.getInstance().sendString(query);
		return Connexion.getInstance().receiveString();
	}

	public static String getAll() { // "lister" & p="tout"
		String[] args = new String[3];
		args[0] = "\"requete\" : \"lister\"";
		args[1] = "\"parametre\" : \"tout\"";
		args[2] = "\"id\" : " + ++id + "";
		String query = createQuery(args);
		Connexion.getInstance().sendString(query);
		return Connexion.getInstance().receiveString();
	}

	private static String createQuery(String[] args) {
		String toRet = "{";
		for (int i = 0; i < args.length; i++) {
			if (args[i] != null) {
				toRet += args[i];
			}
			if (i != args.length - 1 && args[i + 1] != null) {
				toRet += ",";
			}
		}
		toRet += "}\n";
		return toRet;
	}

	public static String postSurname(String string, String string2) { // "modifier_nom"
																		// &
																		// NAME
																		// &
																		// NAME2
		String args[] = new String[4];
		args[0] = "\"requete\" : \"modifier_surnom\"";
		args[1] = "\"parametre_surnom\" : \"" + string + "\"";
		args[2] = "\"parametre_nouveau_surnom\" : \"" + string2 + "\"";
		args[3] = "\"id\" : " + ++id + "";
		String query = createQuery(args);
		Connexion.getInstance().sendString(query);
		return Connexion.getInstance().receiveString();
	}

	public static String postName(String string, String string2) { // "modifier_nom"
																	// & NAME &
																	// NAME 2
		String args[] = new String[4];
		args[0] = "\"requete\" : \"modifier_nom\"";
		args[1] = "\"parametre_nom\" : \"" + string + "\"";
		args[2] = "\"parametre_nouveau_nom\" : \"" + string2 + "\"";
		args[3] = "\"id\" : " + ++id + "";
		String query = createQuery(args);
		System.out.println("STRING TO SEND : " + query);
		Connexion.getInstance().sendString(query);
		return Connexion.getInstance().receiveString();
	}

	public static String putSurname(String string, String string2) { // "ajouter_surnom"&
																		// NAME
																		// &NAME2
		String args[] = new String[4];
		args[0] = "\"requete\" : \"ajouter_nom\"";
		args[1] = "\"parametre_nom\" : \"" + string + "\"";
		args[2] = "\"parametre_surnom\" : \"" + string2 + "\"";
		args[3] = "\"id\" : " + ++id + "";
		String query = createQuery(args);
		Connexion.getInstance().sendString(query);
		return Connexion.getInstance().receiveString();
	}

	public static String close() { // "exit"
		String args[] = new String[2];
		args[0] = "\"requete\" : \"exit\"";
		args[1] = "\"id\" : " + ++id + "";
		String query = createQuery(args);
		Connexion.getInstance().sendString(query);
		return Connexion.getInstance().receiveString();
	}
}
