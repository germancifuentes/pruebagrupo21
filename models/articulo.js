import mongoose from 'mongoose'; 
const Schema = mongoose.Schema; 

const articuloSchema = new Schema({ 
    nombre: {type: String, required: [true, 'Nombre obligatorio']}, 
    descripcion: String, 
    articuloId: String, 
    date:{type: Date, default: Date.now}, 
    activo: {type: Boolean, default: true} 

});

//Convirtiendo a modelo

const Articulo = mongoose.model('Articulo', articuloSchema);
export default Articulo;