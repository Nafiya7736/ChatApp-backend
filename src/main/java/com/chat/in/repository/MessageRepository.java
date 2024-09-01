package com.chat.in.repository;






import org.springframework.data.jpa.repository.JpaRepository;

import com.chat.in.model.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
}

