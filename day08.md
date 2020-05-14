## day08

### Android 资源

###  res资源

| res/animator     | 存放定义了property animations（android 3.0新定义的动画框架）的XML文件 |
| ---------------- | ------------------------------------------------------------ |
| res/anim/        | 存放定义了补间动画（tweened animation）或逐帧动画（frame by frame animation）的XML文件。（该目录下也可以存放定义property animations的XML文件，但是最好还是分开存放） |
| res/raw/         | 存放直接复制到设备中的任意文件。它们无需编译，添加到你的应用程序编译产生的压缩文件中。要使用这些资源，可以调用Resources.openRawResource()，参数是资源的ID，即R.raw.somefilename。 |
| res/drawable/    | 存放能转换为绘制资源（Drawable Resource）的位图文件（后缀为.png, .9.png, svg.jpg, .gif的图像文件)或者定义了绘制资源的XML文件vector xml |
| res/color/       | 存放定义了颜色状态列表资源(Color State List Resource)的XML文件 |
| res/layout/      | 存放定义了用户界面布局的XML文件                              |
| res/menu/        | 存放定义了应用程序菜单资源的XML文件                          |
| res/values-night | 存放定义了多种类型资源的XML文件
这些资源的类型可以是字符串，数据，颜色、尺寸、样式等等 |
| res/xml/         | 存放任意的XML文件，在运行时可以通过调用Resources.getXML()读取 |

### Drawable资源

| Bitmap File     | 一个Bitmap图像文件（.png、.jpg或.gif）。BitmapDrawable。     |
| --------------- | ------------------------------------------------------------ |
| Nine-Patch File | 一个带有伸缩区域的PNG文件，可以基于content伸缩图片（.9.png）。NinePatchDrawable |
| State List      | 一个XML文件，为不同的状态引用不同的Bitmap图像（例如，当按钮按下时使用不同的图片）。StateListDrawable。 |
| Color           | 定义在XML中的资源，指定一个矩形（圆角可以有）的颜色。PaintDrawable。 |
| Shape           | 一个XML文件，定义了一个几何形状，包括颜色和渐变。ShapeDrawable。 |

.9.png格式和svg格式的图片作用基本类似，趋势可能倾向于svg。都可用于自由拉伸不变形图片。

### String Array

<resources>

   <string-array name="planets_array">

​       <item>Mercury</item>

​       <item>Venus</item>

​       <item>Earth</item>

​       <item>Mars</item>

   </string-array>

</resources>

### Dimension常量资源

该资源定义跟屏幕显示相关的一些尺寸常量，一般保存在/res/values/dimen.xml文件中，Android studio新建的工程没有这个文件，自己建一个就好了。

### raw与assets区别

res/raw中的文件会被映射到R.java文件中，访问的时候直接使用资源ID。assets文件夹下的文件不会被映射到R.java中，访问的时候需要AssetManager类。res/raw不可以有目录结构，而assets目录下可以再建文件夹。

