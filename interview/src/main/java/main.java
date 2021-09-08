import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        String[] res = resposta(new String[] {"Aline zenon", "walter Azevedo", "lucas suzuki", "tatiana"});
        System.out.println(res.toString());
    }

    public static String[] resposta(String[] entrada) {
        ArrayList<String> resp = new ArrayList<>();

        for(int i = 0; i < entrada.length; i++) {
            String nomeC = entrada[i];
            int esp = 0;
            while(esp < nomeC.length() && nomeC.charAt(esp) != ' ') esp ++;
            String nome = nomeC.toUpperCase().charAt(0) + nomeC.substring(1, esp);
            String sobrenome = null;

            if (esp != nomeC.length()) {
                sobrenome = nomeC.toUpperCase().charAt(esp + 1) + nomeC.substring(esp + 2);
            }

            String nomeCorrigido = "";
            if (sobrenome != null) {
                nomeCorrigido = sobrenome + ", " + nome;
            } else {
                nomeCorrigido = nome;
            }

            resp.add(nomeCorrigido);
        }

        return mySort(resp);
    }

    public static String[] mySort(ArrayList<String> lista) {
        String[] ordenado = new String[lista.size()];
        int idx = 0;
        while (idx < lista.size()) {
            int contador = 0;
            String alvo1 = lista.get(idx);
            for (int i = 0; i < lista.size(); i++) {
                String alvo2 = lista.get(i);
                if (alvo1.compareTo(alvo2) > 0) {
                    contador++;
                }
            }
            while (ordenado[contador] != null) contador++;
            ordenado[contador] = alvo1;

            idx++;
        }

        return ordenado;
    }
}
