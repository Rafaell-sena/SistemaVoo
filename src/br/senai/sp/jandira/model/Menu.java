package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.VooDelta;
import br.senai.sp.jandira.model.VooGol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void executarMenu() {

        List<Voo> listvoo = new ArrayList<>();

        VooGol vooGol1 = new VooGol("Gl-2530","São Paulo","Minas Gerais", "2023-11-07", 600);
        VooGol vooGol2 = new VooGol("GL-4550", "Rio de Janeiro", "Campinas", "2023-11-22", 600);
        VooGol vooGol3 = new VooGol("GL- 7898", "Bahia", "Natal", "2023-11-29", 600);
        
        VooDelta vooDelta1 = new VooDelta("DL-8844", "França", "EUA", "2023-12-06", 900);
        VooDelta vooDelta2 = new VooDelta("DL-4490", "Argentina", "Peru", "2023-05-09", 1000);

        boolean continuar = true;

        while (continuar) {
            System.out.println("*-*-*-*-*-Bem Vindo-*-*-*-*-* ");
            System.out.println("1- Listar Voos");
            System.out.println("2- Pesquisar Voos");
            System.out.println("3- Sair");
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

            int optionUser = scanner.nextInt();
            scanner.nextLine();

            switch (optionUser) {
                case 1:
                    break;
                case 2:
                    break;
            }

            }

        }
    }




