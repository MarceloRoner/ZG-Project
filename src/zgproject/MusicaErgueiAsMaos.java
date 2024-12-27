package zgproject;

	public class MusicaErgueiAsMaos {

	    public static String gerarRefrao() {
	        return "Erguei as mãos e dai glória a Deus\n" +
	               "Erguei as mãos e dai glória a Deus\n" +
	               "Erguei as mãos\n" +
	               "E cantai como os filhos do Senhor\n\n";
	    }

	    public static String gerarAnimaizinhos(String animal1, String animal2) {
	        return "Os animaizinhos subiram de dois em dois\n" +
	               "Os animaizinhos subiram de dois em dois\n" +
	               "O " + animal1 + "\n" +
	               "E os " + animal2 + ", como os filhos do Senhor\n\n";
	    }

	    public static String gerarDeusDisseNoe() {
	        return "Deus disse a Noé: Constrói uma arca\n" +
	               "Deus disse a Noé: Constrói uma arca\n" +
	               "Que seja feita\n" +
	               "De madeira para os filhos do Senhor\n\n";
	    }

	    public static String gerarMuitosFilhos(String movimentos) {
	        return "O senhor tem muitos filhos\n" +
	               "Muitos filhos ele tem\n" +
	               "Eu sou um deles, você também\n" +
	               "Louvemos ao senhor\n" + 
	               movimentos + "\n\n";
	    }

	    public static String gerarPrimeiraParte() {
	        StringBuilder parte = new StringBuilder();
	        parte.append(gerarRefrao());
	        parte.append(gerarAnimaizinhos("elefante", "passarinhos"));
	        parte.append(gerarAnimaizinhos("minhoquinha", "pinguins"));
	        parte.append(gerarAnimaizinhos("canguru", "sapinho"));
	        parte.append(gerarDeusDisseNoe());
	        parte.append(gerarRefrao());
	        parte.append(gerarRefrao());
	        parte.append("E atenção agora, porque\n\n");
	        return parte.toString();
	    }

	    public static String gerarSegundaParte() {
	        StringBuilder parte = new StringBuilder();
	        String[] movimentos = {
	            "Braço direito",
	            "Braço direito, braço esquerdo",
	            "Braço direito, braço esquerdo, perna direita",
	            "Braço direito, braço esquerdo, perna direita, perna esquerda",
	            "Braço direito, braço esquerdo, perna direita, perna esquerda, balança a cabeça",
	            "Braço direito, braço esquerdo, perna direita, perna esquerda, balança a cabeça, dá uma voltinha",
	            "Braço direito, braço esquerdo, perna direita, perna esquerda, balança a cabeça, dá uma voltinha, dá um pulinho",
	            "Braço direito, braço esquerdo, perna direita, perna esquerda, balança a cabeça, dá uma voltinha, dá um pulinho e abraça o irmão"
	        };

	        for (String mov : movimentos) {
	            parte.append(gerarMuitosFilhos(mov));
	        }
	        return parte.toString();
	    }

	    public static String gerarMusicaCompleta() {
	        return gerarPrimeiraParte() + gerarSegundaParte();
	    }
	}


