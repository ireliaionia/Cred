package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;



public class Controller {

    @FXML
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18;
    @FXML
    private TextField answer, answer2, answer3;
    @FXML
    private Button copyb1, copyb2, copyb3;


    @FXML
    public void initialize(){
        b1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {

                    answer.setText("https://member.impactradius.com/login.user");
                    answer2.setText("Richard.Klatovsky");
                    answer3.setText("gethatch16");
                }

        });
        b2.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                answer.setText("http://www.webgains.com/front/user/login");
                answer2.setText("registration@gethatch.com");
                answer3.setText("2BjiSdhrh&h");
            }

        });
        b3.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                answer.setText("https://account.shareasale.com/a-login.cfm");
                answer2.setText("iceleads");
                answer3.setText("3h3efhdg");
            }

        });
        b4.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                answer.setText("https://pvn.douglas.de/");
                answer2.setText("registration@gethatch.com");
                answer3.setText("dlhatchde16");
            }

        });
        b5.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                answer.setText("http://www.effiliation.com/en/publishers-area/");
                answer2.setText("hatch");
                answer3.setText("123Hatch!");
            }

        });
        b6.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                answer.setText("https://login.linkshare.com/sso/login");
                answer2.setText("gethatch.com");
                answer3.setText("3h3efhdg");
            }

        });
        b7.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                answer.setText("");
                answer2.setText("");
                answer3.setText("");
            }

        });
        b8.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                answer.setText("https://associates.amazon.ca/login");
                answer2.setText("j.kroese@iceleads.com");
                answer3.setText("3h3efhdg");
            }

        });
        b9.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                answer.setText("https://associates.amazon.cn/");
                answer2.setText("registration@iceleads.com");
                answer3.setText("d6sg7va");
            }

        });
        b10.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                answer.setText("https://affiliate-program.amazon.com/gp/associates/network/reports/main.html");
                answer2.setText("j.kroese@iceleads.com");
                answer3.setText("3h3efhdg");
            }

        });
        b11.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                answer.setText("https://affiliate.amazon.co.jp/login");
                answer2.setText("registration@iceleads.com");
                answer3.setText("d6sg7va");
            }

        });
        b12.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                answer.setText("https://affiliate-program.amazon.co.uk/login");
                answer2.setText("j.kroese@iceleads.com");
                answer3.setText("3h3efhdg");
            }

        });
        b13.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                answer.setText("https://partnernet.amazon.de/login");
                answer2.setText("j.kroese@iceleads.com");
                answer3.setText("3h3efhdg");
            }

        });
        b14.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                answer.setText("https://afiliados.amazon.es/login");
                answer2.setText("j.kroese@iceleads.com");
                answer3.setText("3h3efhdg");
            }

        });
        b15.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                answer.setText("https://partenaires.amazon.fr/login");
                answer2.setText("j.kroese@iceleads.com");
                answer3.setText("3h3efhdg");
            }

        });
        b16.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                answer.setText("https://affiliate-program.amazon.in/login");
                answer2.setText("info@iceleads.com");
                answer3.setText("3h3efhdg");
            }

        });
        b17.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                answer.setText("https://programma-affiliazione.amazon.it/login");
                answer2.setText("j.kroese@iceleads.com");
                answer3.setText("3h3efhdg");
            }

        });
        b18.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                answer.setText("");
                answer2.setText("");
                answer3.setText("");
            }

        });

        copyb1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                answer.selectAll();
                answer.copy();
            }
        });
        copyb2.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                answer2.selectAll();
                answer2.copy();
            }
        });
        copyb3.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                answer3.selectAll();
                answer3.copy();
            }
        });
    }
}
