package controllers;

import java.util.*;

import com.sun.security.ntlm.Client;

import play.*;
import play.mvc.*;
import play.data.validation.*; 
import models.*;
import play.libs.*;
import play.cache.*;


public class Application extends Controller {

    public static void index() {
        render();
    }
	
}