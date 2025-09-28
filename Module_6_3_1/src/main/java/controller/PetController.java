package controller;

import model.Pet;
import view.PetView;
import view.View;


import javafx.animation.AnimationTimer;

public class PetController {
        private final Pet pet;
        private final PetView view;

        private double targetX;
        private double targetY;
        private boolean hasTarget;

        private final double speed = 2.0;

        public PetController(Pet pet, PetView view) {
            this.pet = pet;
            this.view = view;
            this.hasTarget = false;

            // Mouse events
            view.setOnMouseMoved(e -> setTarget(e.getX(), e.getY()));
            view.setOnMouseExited(e -> clearTarget());

            // Animation loop
            new AnimationTimer() {
                @Override
                public void handle(long now) {
                    update();
                    view.draw(pet.getX(), pet.getY());
                }
            }.start();
        }

        private void setTarget(double x, double y) {
            this.targetX = x;
            this.targetY = y;
            this.hasTarget = true;
        }

        private void clearTarget() {
            this.hasTarget = false;
        }

        private void update() {
            if (!hasTarget) return;

            double dx = targetX - pet.getX();
            double dy = targetY - pet.getY();
            double distance = Math.sqrt(dx * dx + dy * dy);

            if (distance < speed) {
                pet.setLocation(targetX, targetY);
                hasTarget = false;
                return;
            }

            double stepX = (dx / distance) * speed;
            double stepY = (dy / distance) * speed;
            pet.setLocation(pet.getX() + stepX, pet.getY() + stepY);
        }

        public PetView getView() {
            return view;
        }


}

