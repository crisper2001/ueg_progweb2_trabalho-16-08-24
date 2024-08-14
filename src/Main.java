import javax.swing.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String nomeClasse = "";
        do {
            nomeClasse = JOptionPane.showInputDialog("Digite o nome de uma classe:");
        } while (nomeClasse.isEmpty());
        try {
            Class<?> classe = Class.forName(nomeClasse);
            Constructor<?> construtor = classe.getConstructor();
            Object objeto = construtor.newInstance();
            ArrayList<Field> listaAtributos = ReflectionUtil.getHierarchyFields(objeto);
            ArrayList<Method> listaMetodos = ReflectionUtil.getHierarchyMethods(objeto);
            String atributosNomes = "";
            String metodosNomes = "";
            for (Field f : listaAtributos) {
                atributosNomes = atributosNomes.concat(f.getName() + "\n");
            }
            for (Method m : listaMetodos) {
                metodosNomes = metodosNomes.concat(m.getName() + "\n");
            }
            JOptionPane.showMessageDialog(
                    null,
                    "A classe '" + nomeClasse + "' foi encontrada.\n\n" + "ATRIBUTOS:\n\n" + atributosNomes + "\nMÉTODOS:\n\n" + metodosNomes,
                    "Informações",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "A classe '" + nomeClasse + "' não foi encontrada.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}