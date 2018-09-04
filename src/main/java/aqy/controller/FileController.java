package aqy.controller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public class FileController {
    public void upload(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //获取上传的路径
        String path = request.getSession().getServletContext().getRealPath("/");
        System.out.println(path);
        //创建工厂
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        //将requset请求里面的内容转换成 FileItem 集合
        List<FileItem> fileItems = upload.parseRequest(request);
        //循环获取文件
        for (FileItem fileitem:fileItems) {
            //判断是否是表单属性
            if(fileitem.isFormField()){
                //form>type!=file
                System.out.println(fileitem.getFieldName()+"");
                System.out.println(fileitem.getString("UTF-8")+"");
            }else{
                //form>type==file
                //获取文件输入流
                InputStream in =  fileitem.getInputStream();
                //创建文件输出流
                //获取当前时间戳(当做文件名）
                long filename = System.currentTimeMillis();
                //获取上传时文件名
                String name = fileitem.getName();
                name = name.substring(name.lastIndexOf("."));
                //地址+文件名+后缀
                OutputStream out = new FileOutputStream(path+filename+name);
                byte[] b = new byte[1024*10];
                while (in.read(b)!=-1){
                    out.write(b);
                }
                out.close();
                in.close();
            }

        }

    }


    /**
     * file/upload.do
     */
}
