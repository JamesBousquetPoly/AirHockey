package com.firstopenglproject.firstopenglproject;

import static android.opengl.GLES20.*;
import static android.opengl.GLUtils.*;
import static android.opengl.Matrix.*;

import android.content.Context;

public class ShaderProgram {
    protected static final String U_MATRIX = "u_Matrix";
    protected static final String U_TEXTURE_UNIT = "u_TextureUnit";

    protected static final String A_POSITION = "a_Position";
    protected static final String A_COLOR = "a_Color";
    protected static final String A_TEXTURE_COORDINATES = "a_TextureCoordinates";

    protected final int program;
    protected ShaderProgram(Context context, int vertexShaderResouceId, int fragmentShaderResourceId){
        program = ShaderHelper.buildProgram(
                TextResourceReader.readTextFileFromResource(context,vertexShaderResouceId),
                TextResourceReader.readTextFileFromResource(context, fragmentShaderResourceId));
    }

    public void useProgram(){
        glUseProgram(program);
    }
}
