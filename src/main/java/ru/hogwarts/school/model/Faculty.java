package ru.hogwarts.school.model;

import java.util.Objects;

public class Faculty {
        private Long id;
        private String name;
        private int color;

//    public Faculty() {
//    }

        public Faculty(Long id, String name, int color) {
            this.id = id;
            this.name = name;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Faculty{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", color=" + color +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Faculty faculty = (Faculty) o;
            return color == faculty.color && Objects.equals(id, faculty.id) && Objects.equals(name, faculty.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, color);
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getColor() {
            return color;
        }

        public void setColor(int color) {
            this.color = color;
        }
}