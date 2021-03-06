package br.com.socialmeli.dtos;

import java.util.List;

public class SellerClientsListDTO {
    private Long userId;
    private String userName;
    private List<UserDTO> folloers;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<UserDTO> getFolloers() {
        return folloers;
    }

    public void setFolloers(List<UserDTO> folloers) {
        this.folloers = folloers;
    }
}
