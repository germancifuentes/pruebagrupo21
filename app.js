import express from 'express';
import morgan from 'morgan'; 
import cors from 'cors'; 
import path from 'path';

const app = express(); 

//CONEXION A BASE DE DATOS

const mongoose = require('mongoose');
const uri = 'mongodb://localhost:27017/prueba';
const options = {useNewUrlParser: true, useUnifiedTopology: true};

mongoose.connect(uri, options).then( 
    () => { 
        console.log('Conexion exitosa a la base de datos') 
    }, 
    err => { err } 
  );

//MIDDLEWARE
app.use(morgan('tiny'));
app.use(cors());
app.use(express.json());

app.use(express.urlencoded({ extended: true }));

app.use(express.static(path.join(__dirname, 'public')));

//RUTA
app.use('/api', require('./routes/articulo')); 
 

// Middleware para Vue.js router modo history 
const history = require('connect-history-api-fallback'); 
app.use(history()); 


//PUERTO
//app.listen(3000, function () { 
//    console.log('El servidor escucha por el puerto 3000!');
//});

app.set('puerto', process.env.PORT || 3000); app.listen(app.get('puerto'), function () { 
    console.log('Example app listening on port'+ app.get('puerto')); 
});