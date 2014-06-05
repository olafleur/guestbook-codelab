/**
 * Copyright (c) 2014 by ArcBees Inc., All rights reserved.
 * This source code, and resulting software, is the confidential and proprietary information
 * ("Proprietary Information") and is the intellectual property ("Intellectual Property")
 * of ArcBees Inc. ("The Company"). You shall not disclose such Proprietary Information and
 * shall use it only in accordance with the terms and conditions of any and all license
 * agreements you have entered into with The Company.
 */

package com.olivierlafleur.appengine.demos.guestbook.dao;

import static com.olivierlafleur.appengine.demos.guestbook.dao.OfyService.ofy;

public class GreetingDao extends BaseDao<Greeting> {
    public GreetingDao() {
        super(Greeting.class);
    }

    @Override
    public Greeting get(Long id) {
        return ofy().load().type(clazz).id(id).now();
    }
}
