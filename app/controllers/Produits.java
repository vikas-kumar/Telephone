package controllers;

import java.util.List;

import models.Produit;

import org.hibernate.annotations.Check;

import play.*;
import play.mvc.*;

@With(Secure.class)
public class Produits extends CRUD {

}
