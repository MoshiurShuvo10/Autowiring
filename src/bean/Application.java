package bean;

public class Application {
			private User user;
/*
			public User getUser() {
				return user;
			}

			public void setUser(User user) {
				this.user = user;
			} */
			public Application(User user) {
				this.user=user;
			}
			public void display() {
				System.out.println(user);
			}
}
