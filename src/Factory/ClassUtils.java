package Factory;

import java.io.File;
import java.io.IOException;

import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * @Author: Y_uan
 * @Date: 2018/11/22 9:11
 * @mail: yy494818027@163.com
 */
@SuppressWarnings("all")
public class ClassUtils {
    public static List<Class> getAllClassByInterface(Class c){
        //给一个接口，返回这个接口的所有实现类
        List<Class> returnClassList = new ArrayList<Class>();
        //如果不是一个接口，则不做处理
        if (c.isInterface()){
            String packageName = c.getPackage().getName();//获得当前包名
            try{
                List<Class> allClass = getClasses(packageName);//获得当前包下以及包下的所有类
                for (int i = 0; i < allClass.size(); i++){
                    if (c.isAssignableFrom(allClass.get(i))){//判断是不是一个接口
                        if (!c.equals(allClass.get(i))){//本身加不进去
                            returnClassList.add(allClass.get(i));
                        }
                    }
                }
            } catch (ClassNotFoundException e){
                e.printStackTrace();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        return returnClassList;
    }

    private static List<Class> getClasses (String packageName) throws IOException, ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String path = packageName.replace(".","/");
        Enumeration<URL> resources = classLoader.getResources(path);
        List<File> dirs = new ArrayList<File>();
        while (resources.hasMoreElements()){
            URL resource = resources.nextElement();
            dirs.add(new File(resource.getFile()));
        }
        ArrayList<Class> classes = new ArrayList<Class>();
        for (File directory : dirs){
            classes.addAll(findClasses(directory, packageName));
        }
        return classes;
    }

    private static List<Class> findClasses(File directory, String packageName) throws ClassNotFoundException {
        List<Class> classes = new ArrayList<Class>();
        if (!directory.exists()) {
            return classes;
        }
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                assert !file.getName().contains(".");
                classes.addAll(findClasses(file, packageName + '.'
                        + file.getName()));
            }else if (file.getName().endsWith(".class")){
                classes.add(Class.forName(packageName
                        + "."
                        + file.getName().substring(0, file.getName().length() - 6)));
            }
        }
        return classes;
    }
}