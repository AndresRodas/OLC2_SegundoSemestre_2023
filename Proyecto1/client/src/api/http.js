import axios from 'axios';
const apiUrl = process.env.REACT_APP_API_URL

export const PostMethod = async (url, data) => {
    try {
        const response = await axios.post(`${apiUrl}/${url}`, data);
        return response.data
    } catch (error) {
        console.error('Error en la solicitud:', error);
    }
}