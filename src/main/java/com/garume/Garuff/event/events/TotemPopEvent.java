package com.garume.Garuff.event.events;

import com.garume.Garuff.event.Event;

import net.minecraft.entity.Entity;

public class TotemPopEvent extends Event {

	private final Entity entity;

	public TotemPopEvent(Entity entity) {
		super();
		this.entity = entity;
	}

	public Entity getEntity() {
		return this.entity;
	}
}