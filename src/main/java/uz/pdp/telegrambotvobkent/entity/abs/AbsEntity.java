package uz.pdp.telegrambotvobkent.entity.abs;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.UUID;

@MappedSuperclass
public class AbsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @CreationTimestamp
    private LocalDateTime updatesAt;
}
