package com.example.feedback;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/feedback")
@CrossOrigin(origins = "*")
public class FeedbackController {

    @PostMapping
    public String receiveFeedback(@RequestBody Feedback feedback) {
        System.out.println("Received feedback: " + feedback);
        return "Спасибо за обратную связь, " + feedback.getName() + "!";
    }

    static class Feedback {
        private String name;
        private String email;
        private String comment;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
        public String getComment() { return comment; }
        public void setComment(String comment) { this.comment = comment; }

        @Override
        public String toString() {
            return "Name: " + name + ", Email: " + email + ", Comment: " + comment;
        }
    }
}