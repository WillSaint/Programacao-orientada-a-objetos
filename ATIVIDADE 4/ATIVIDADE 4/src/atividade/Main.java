package atividade;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

        Gerente gerente = new Gerente(35,"Antonio Carlos","11122233345","Gerente Regional",5525.50, 0.15,"Norte-Nordeste",0);
        Vendedor vendedor = new Vendedor(25,"Felipe Lucena","66677788890","Vendedor Interno", 1550.50, gerente,0,0.05,0);
        Vendedor vendedor2 = new Vendedor(25,"Augusto Ferreira","12345678910","Vendedor Externo", 1550.50, gerente,0,0.05,0);

        List<Vendas> vendas = new ArrayList<>();
        List<Vendas> vendas02 = new ArrayList<>();
        List<Vendedor> vendedores = new ArrayList<>();

        
        vendedores.add(vendedor);
        vendedores.add(vendedor2);

        
        gerente.setVendedores(vendedores);

        
        Vendas vendas1 = new Vendas(850);
        Vendas vendas2 = new Vendas(325);
        Vendas vendas3 = new Vendas(560);
        Vendas vendas4 = new Vendas(850);
        Vendas vendas5 = new Vendas(785);
        Vendas vendas6 = new Vendas(345);
        Vendas vendas7 = new Vendas(985);
        Vendas vendas8 = new Vendas(400);
        Vendas vendas9 = new Vendas(780);
        Vendas vendas10 = new Vendas(476);

       
        vendas.add(vendas1);
        vendas.add(vendas2);
        vendas.add(vendas3);
        vendas.add(vendas4);
        vendas.add(vendas5);

        
        vendas02.add(vendas6);
        vendas02.add(vendas7);
        vendas02.add(vendas8);
        vendas02.add(vendas9);
        vendas02.add(vendas10);

        vendedor.setVendas(vendas);

        vendedor2.setVendas(vendas02);

        vendedor.getTotalVendas();
        vendedor.getTotalComissao();

        vendedor2.getTotalVendas();
        vendedor2.getTotalComissao();

        gerente.getComissaoTotalGerente();

        System.out.println();
        System.out.println(vendedor.getNome()+" "+vendedor.getVendas()+ " " + vendedor.getSalario());
        System.out.println();
        System.out.println(vendedor2.getNome()+" "+vendedor2.getVendas()+ " " + vendedor2.getSalario());
        System.out.println();
        System.out.println(gerente.getNome()+" "+gerente.getSalario());

    }

}
