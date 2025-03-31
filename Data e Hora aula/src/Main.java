import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
//=============================================================================================================================================================

//        instanciacao de data
//        localDate = ano, mes, dia
//        pega os dados do sistema do computador e guarda em uma variavel
        LocalDate data1 = LocalDate.now();
//        System.out.println("data1 "+data1);  //saida: 2025-03-31
//       LocalDateTime = ano, mes, dia, hora(LOCAL)
        LocalDateTime data2 = LocalDateTime.now();
//        System.out.println("data2 "+data2); //saida: 2025-03-31T11:52:57.238881
//        data e hora(GMT- horario de londres)
        Instant data3 = Instant.now();
//        System.out.println("data3 "+data3); //saida 2025-03-31T14:52:57.238881Z
//=============================================================================================================================================================

//      Pegar um texto iso 8601 e converter para hora
        LocalDate data4 = LocalDate.parse("2002-05-03");
//        System.out.println("Data iso 8601 " +data4);
//
        LocalDateTime data5 = LocalDateTime.parse("2002-05-03T01:30:36");
//        System.out.println(data5);
        Instant data6 = Instant.parse("2002-05-03T01:30:36z");
//        System.out.println(data6);
//=============================================================================================================================================================

//      TRABALHANDO COM OUTROS HORARIOS DIFERENTES COM O PADRAO GMT:
//      recebe uma Instant de uma regiao, como o de sao paulo por exemplo.
//      printa o horario que seria o de londres no momento
        Instant data7 = Instant.parse("2002-05-03T01:30:36-03:00");
//        System.out.println(data7);
//=============================================================================================================================================================

//        COMO RECEBER DATA DE UM CLIENTE NO FORMATO DATA/MES/ANO
//        vamos usar o DateTimeFormatter!
//        De acordo com a documentacao abaixo:
//        https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

//        LocalDate data8 = LocalDate.parse("03/06/2003",formatter);// o formater no metodo parse eh uma sobrecarga de como ele vai interpretar o texto.
//        System.out.println(" data 8: "+data8);
//        LocalDateTime data9 = LocalDateTime.parse("03/06/2003 23:30",formatter2);
//        System.out.println(" data 9: "+data9);
//        PODE TMB SER FEITO DA SEGUINTE FORMA:
        LocalDateTime data10 = LocalDateTime.parse("05/05/5555 23:30",DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
//        System.out.println(" data 10: "+data10);

//=============================================================================================================================================================
//        INFORMAR DATAS A PARTIR DE DADOS ISOLADOS.
        LocalDate data11 = LocalDate.of(2002,8,14);
//        System.out.println(data11);
        LocalDateTime data12 = LocalDateTime.of(2002,2,2,10,30);
//        System.out.println(data12);
//=============================================================================================================================================================
//        TRABALHANDO A FORMATACAO DE DIFERENTES FORMAS

        LocalDate var1 = LocalDate.parse("2025-03-31");
        LocalDateTime var2 = LocalDateTime.parse("2025-03-31T01:30:26");
        Instant var3 = Instant.parse("2025-03-31T01:30:26z");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

//        OBJETO DE FORMATACAO CONSIDERANDO O FUSOHORARIO DO SISTEMA LOCAL DO USUARIO
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("var1 "+ var1.format(formatter));
        System.out.println("var1 "+ formatter.format(var1));
        System.out.println("var1 "+ var1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("var2 "+ var2.format(formatter2));
        System.out.println("var2 "+ formatter2.format(var2));

//      PRINTANDO O FORMATTER 3
//        o obejto instant nao tem um metodo .format devido a isso fazemos a formatacao da seguinte maneira
//        configuramos o Formatter para que esse receba o fuso horario do cliente/ usuario e entao formate seguindo a conversao de horario
        System.out.println("var3 "+ formatter3.format(var3));
//=============================================================================================================================================================
//      outra alternativa para fazer o print desses metodos eh utlizar os metodos ja criado como por exemplo
        DateTimeFormatter formatter4 =DateTimeFormatter.ISO_INSTANT;
        System.out.println("var3: " + formatter4.format(var3));
//=============================================================================================================================================================
//        CONVERTER UMA DATA GLOBAL PARA LOCAL
//          TEM QUE INFORMAR O TIMEZONE DO CLIENT
        LocalDate j1 = LocalDate.parse("2002-03-20");
        LocalDateTime j2 = LocalDateTime.parse("2002-02-20T01:30:26");
        Instant j3 = Instant.parse("2002-02-20T01:30:26z");

        LocalDate r1 = LocalDate.ofInstant(j3,ZoneId.systemDefault());// recebe do sistema do client o localZone e retorna a conversao de horario formatada
//        tambem eh possivel colocar o nome como esta na clase da data.

//=============================================================================================================================================================
//        RECEBER UMA DATA LOCAL E FILTRAR O DIA, O MES, O ANO
//        VAR1.GET
        System.out.println("dia " + j1.getDayOfMonth());
        System.out.println("mes " + j1.getMonthValue());
        System.out.println("ano " + j1.getYear());
//      hora
        System.out.println(var2.getHour());

//=============================================================================================================================================================


//        FAZENDO CALCULOS COM DATA E HORA
        LocalDate pastweeklocaldate =j1.minusDays(7);
        LocalDateTime nextweeeklocaldate =j2.plusDays(7);
        System.out.println(pastweeklocaldate);
        System.out.println(nextweeeklocaldate);
//        DURACAO DE TEMPO
        Duration l1 = Duration.between(j2 , nextweeeklocaldate);// usado para metodos LocalDateTime
        System.out.println(l1.toDays() + " dias");
        Duration l2 = Duration.between(pastweeklocaldate.atStartOfDay(), j1.atStartOfDay()); //usado para metodos LocalDate
        System.out.println(l2.toDays());


//=============================================================================================================================================================

        
    }

}