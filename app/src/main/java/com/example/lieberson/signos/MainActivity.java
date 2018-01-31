package com.example.lieberson.signos;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ListView listaSignos;
    private String[] signos = {"Áries", "Touro", "Gêmeos", "Câncer", "Leão",
                            "Virgem", "Libra", "Escorpião", "Sagitário",
                            "Capricónio", "Aquário", "Peixes"};

    private String[] perfis = {
            "21/03 - 20/04 - Os arianos em geral possuem grande energia e vitalidade. São corajosos, combativos e costumamter as qualidades necessárias para vencer, realizar, comandar e " +
                    "impor disciplina. São fisicamente harmoniosos e sexualmente atraentes.",
            "21/04 - 20/05 - Signo de terra, regido por Vênus, que confere sensibilidade, estabilidade e profundidade às emoções, e disposições amáveis.\n" +
                    "As pessoas de Touro são, em geral, amantes de beleza, do conforto, de tudo o que der prazer, e do romantismo, em especial.\n" +
                    "São muito esforçados, e sua teimosia faz com que cheguem às últimas conseqüências em seus empreendimentos.\n" +
                    "Sua paciência e determinação acabam sendo de grande ajuda nos negócios.",
            "21/05 - 20/06 - Signo de Ar, regido por Mercúrio, que confere inteligência, versatilidade, agilidade mental, sociabilidade, grande poder de persuasão.\n" +
                    "As pessoas de Gêmeos são naturalmente inquietas e curiosas, sempre muito comunicativas.Preocupam-se muito com atividades intelectuais, e procuram amigos igualmente inteligentes.\n" +
                    "Adaptam-se facilmente a qualquer tipo de ambiente ou pessoa. Isso faz com que possam viver várias experiências ao mesmo tempo, tirando de todas grande proveito.\n" +
                    "Uma das principais características de Gêmeos é a jovialidade, o que faz com que raramente amadureçam, embora sejam capazes de compreender perfeitamente a complexidade das situações.\n" +
                    "Curiosas por natureza, as pessoas desse signo gostam de experimentar e conhecer de tudo um pouco.",
            "21/06 - 20/07 - Signo de água regido pela Lua, o que confere enormes sensibilidade e criatividade, e inclina á vida doméstica.\n" +
                    "São por natureza indivíduos muito simpáticos e bem humorados, mas ao mesmo tempo introvertidos, tímidos e sonhadores; parecem estar sempre nas nuvens.\n" +
                    "Por serem muito reservados, é sempre difícil ajudá-los. Retiram-se para dentro de sua casca, prudentemente, toda vez que sente negatividade ou desarmonia pairando no ar.\n" +
                    "São muito criativos, bastante emotivos e muito protetores. Estão constantemente ajudando os outros e envolvendo-se numa boa causa, o que satisfaz seu enorme desejo de ser útil.\n" +
                    "Apreciam todo tipo de música, conforme seu estado de espírito.",
            "21/07 - 22/08 - Signo de fogo regido pelo Sol, que torna os nativos saudáveis, bonitos, carismáticos, cheios de vida, exuberantes e comunicativos.\n" +
                    "Os leoninos caminham decididamente em direção ao sucesso, e só se contentam com a glória.\n" +
                    "Podem ser ambiciosos e vaidosos, sempre conscientes dos seus méritos, e quase nunca de seus limites. Seu espírito é de líder, ou, é aquele que sempre ocupa o centro do palco.\n" +
                    "Podem superar-se, e seus objetivos são elevados. Estão sempre envolvidos em projetos de grande vulto, artísticos ou para exibição pública, que quase sempre são reconhecidos com elogios ou prêmios. ",
            "23/08 - 22/09 - Signo de terra regido por Mercúrio, que confere raciocínio lógico, inteligência, bastante sensibilidade, agilidade mental, capacidade de análise e poder de observação.\n" +
                    "Os virginianos são bastante reservados, mas muito afetuosos, demonstrando seus sentimentos com atitudes delicadas e pouco comuns. São críticos e introspectivos, perfeccionistas, atentos à detalhes.\n" +
                    "Esse perfil costuma criar dificuldades em fazer amizades, pois torna-os muito seletivos. Entretanto, sentem-se à vontade em ambientes culturais ou com amigos intelectuais.\n" +
                    "Apresentam uma imagem convencional. ",
            "23/09 - 22/10 - Signo de ar regido por Vênus, que exalta a sensibilidade e refina as emoções e sensações.\n" +
                    "Está associado à beleza, ao amor e à harmonia.\n" +
                    "As pessoas de Libra são românticas, e sempre dispostas ao amor.\n" +
                    "Gostam de participar da vida social, de preferência acompanhadas de gente interessante.\n" +
                    "São amáveis e simpáticas, muito alegres, elegantes, compreensivas e generosas. Gostam de luxo e conforto, das coisas requintadas, arte, beleza e cultura.",
            "23/10 - 21/11 - Signo de Água regido por Plutão, que confere grande magnetismo e poder, determinação e criatividade.\n" +
                    "Os nascidos em Escorpião são inteligentes, arredios, têm emoções e sentimentos fortes, são muito persistentes, mas também podem ser rancorosos e obstinados.\n" +
                    "Desconfiados e ciumentos, resguardam a sua privacidade a todo custo, e preservam a vida familiar da maneira mais tradicional possível.\n" +
                    "Sentem-se atraídos pela competição, e para isso contam com uma enorme inteligência, além de serem bons estrategistas. O sangue frio é sua melhor arma.\n" +
                    "Despertam a curiosidade das pessoas, graças ao mistério que criam em torno de si.\n" +
                    "São muito exigentes em tudo. ",
            "22/11 - 22/12 - Signo de fogo regido por Júpiter, que confere generosidade, nobreza, sinceridade e dignidade, bem como uma natureza otimista e jovial, e um caráter justo.\n" +
                    "Os sagitarianos são inteligentes, de raciocínio brilhante, profundo e lógico. Ensinam e aprendem com igual facilidade.\n" +
                    "São sempre detalhistas, exigentes, impulsivos.\n" +
                    "Exuberantes e entusiasmados, podem tender ao exagero, às vezes.",
            "22/12 - 20/01 - Signo de terra, regido por Saturno, que confere solidez, ambição e cautela.\n" +
                    "Os capricornianos fazem planos, e têm paciência de deixa-los amadurecer.\n" +
                    "São modestos, reservados, tranqüilos, práticos e econômicos. \n" +
                    "São persistentes, e não desistem enquanto não conquistam seus objetivos.\n" +
                    "Não são amantes de vida social intensa, nem muito comunicativos, entretanto possuem habilidade para comércio e finanças.",
            "21/01 - 19/02 - Signo de ar regido por Urano, que confere dons artísticos, capacidade critica, genialidade, originalidade, intuição acentuada.\n" +
                    "Aquário é um signo fraterno, e os aquarianos costumam ser dotados de forte espírito humanitário.\n" +
                    "São progressistas e muito avançados em suas idéias, o que faz com que sejam considerados, quase sempre, muito adiantados para seu tempo.\n" +
                    "Para os aquarianos, a vida tem que ter colorido e circunstâncias inusitadas.",
            "20/02 - 20/03 - Signo de água, regido por Netuno.\n" +
                    "Sonhadores, emotivos, muito receptivos, indecisos, sensuais, os piscianos podem ser considerados os mais maleáveis em todo o zodíaco, com todas as características, positivas ou negativas, que esta particularidade possa conferir.\n" +
                    "Possuem personalidade sensível e impressionável, podendo chegar à instabilidade emocional."

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = findViewById(R.id.listViewId);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos
        );

        listaSignos.setAdapter(adaptador);

        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                int codigoPosicao = i;
                Toast.makeText(getApplicationContext(), perfis[codigoPosicao], Toast.LENGTH_LONG).show();





            }
        });





    }
}
