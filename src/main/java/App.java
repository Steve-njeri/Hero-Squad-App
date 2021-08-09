import models.Hero;
import models.Squad;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static <hero> void main(String[] args) {
        staticFileLocation("/public");
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "index.hbs");
        },new HandlebarsTemplateEngine());


        get("/hero-form",(req, res) ->{
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "hero-form.hbs");
        }, new HandlebarsTemplateEngine());

        post("/heroes", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("heroName");
            int age=Integer.parseInt(request.queryParams("heroAge"));
            String power=request.queryParams("heroPower");
            String weakness=request.queryParams("heroWeakness");
            Hero myHero = new Hero(name, age, power, weakness);
            model.put("myHero", myHero);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());

        get("/hero",(req, res) ->{
            Map<String, Object> model = new HashMap<>();
            ArrayList<Hero> hero = Hero.getAllInstances();
            model.put("hero",hero);
            return new ModelAndView(model, "hero.hbs");
        }, new HandlebarsTemplateEngine());

        get("/heroes/delete",(request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            Hero.clearAllHeroes();
            model.put("hero",Hero.getAllInstances());
            return new ModelAndView(model,"hero.hbs");
        },new HandlebarsTemplateEngine());

        get("/squad-form", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "squad-form.hbs");
        }, new HandlebarsTemplateEngine());

        get("/squads/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<Hero> heroes=Hero.getAllInstances();
            ArrayList<Hero> heroesList=new ArrayList<>();
            for (int i=0;i<heroes.size();i++){
                if(heroes.get(i).isSquadMember()){
                    heroesList.add(heroes.get(i));
                }
            }
            model.put("hero",Hero.getAllInstances());
            return new ModelAndView(model,"squad-form.hbs");
        }, new HandlebarsTemplateEngine());

        get("/squad", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("squad", Squad.getSquadInstances());
            return new ModelAndView(model, "squad.hbs");
        }, new HandlebarsTemplateEngine());


        post("/squad", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String name = request.queryParams("squadName");
            String cause=request.queryParams("squadCause");
            int maxSize=Integer.parseInt(request.queryParams("squadSize"));
            ArrayList<Hero> hero=new ArrayList<>();
            if(request.queryParamsValues("squadHero")!=null){
                String[] selectedHeroes= request.queryParamsValues("squadHero");
                for(int i=1;i<=selectedHeroes.length;i++){
                    Hero addHero=Hero.findById(i);
                    if(hero.size()<maxSize){
                        addHero.updateHeroStatus(true);
                        hero.add(addHero);
                    }
                }
            }
            Squad newSquad= new Squad(name,cause,maxSize,hero);
            model.put("hero",Hero.getAllInstances());
            model.put("squad", newSquad.getHero());
            return new ModelAndView(model, "squad-form.hbs");
        }, new HandlebarsTemplateEngine());

        get("/squad", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("squad", Squad.getSquadInstances());
            return new ModelAndView(model, "squad.hbs");
        }, new HandlebarsTemplateEngine());

        get("/squad/delete",(request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            Squad.clearAllSquads();
            ArrayList<Hero> hero = Hero.getAllInstances();
            for(int i = 0; i<hero.size(); i++){
                hero.get(i).updateHeroStatus(false);
            }
            model.put("squad ",Squad.getSquadInstances());
            return new ModelAndView(model,"squad.hbs");
        },new HandlebarsTemplateEngine());

        get("/squad/:id",(request, response) -> {
            Map<String, Object> model = new HashMap<>();
            int idOfSquadToFind=Integer.parseInt(request.params(":id"));
            Squad foundSquad=Squad.findById(idOfSquadToFind);
            model.put("squad",foundSquad);
            ArrayList<Squad> squads= (ArrayList<Squad>) Squad.getSquadInstances();
            model.put("squad",squads);
            return new ModelAndView(model,"squad.hbs");
        },new HandlebarsTemplateEngine());

        get("/squad/:id",(request, response) -> {
            Map<String, Object> model = new HashMap<>();
            int idOfSquadToFind=Integer.parseInt(request.params(":id"));
            Squad foundSquad=Squad.findById(idOfSquadToFind);
            model.put("squad",foundSquad);
            ArrayList<Squad> squads= (ArrayList<Squad>) Squad.getSquadInstances();
            model.put("squad",squads);
            return new ModelAndView(model,"squad.hbs");
        },new HandlebarsTemplateEngine());
    }
}
