import java.awt.Image;

public class Card
	{
		protected String name;
		protected String description;
		protected Image image;
		
		
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public String getDescription()
			{
				return description;
			}
		public void setDescription(String description)
			{
				this.description = description;
			}
		public Image getImage()
			{
				return image;
			}
		public void setImage(Image image)
			{
				this.image = image;
			}
	}
