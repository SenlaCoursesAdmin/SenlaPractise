package SenlaPractise.SenlaPractiseZad1.entity;

public enum UserRole {
    USER(5),
    SUPPORT(15),
    ADMIN(30);

    Integer discount;

    UserRole(Integer discount) {
        this.discount = discount;
    }

    public static Integer getDiscountForRole(String role){
        return UserRole.valueOf(role.toUpperCase()).discount;
    }
}
