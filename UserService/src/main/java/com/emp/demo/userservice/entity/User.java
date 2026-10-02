<<<<<<< HEAD
package com.emp.demo.userservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class User {
    @Id
    String id;
    @Column(length = 25,nullable = false)
    String name;
    String email;
    String about;
}
=======
package com.emp.demo.userservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class User {
    @Id
    String id;
    @Column(length = 25,nullable = false)
    String name;
    String email;
    String about;
}
>>>>>>> 55da827e08f63666ea875620ecbafcf664e5043b
